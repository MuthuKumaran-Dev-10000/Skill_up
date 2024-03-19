const express = require('express');
const bodyParser = require('body-parser');
const cors = require('cors');
const app = express();
const port = 3000;

app.use(cors());
app.use(bodyParser.urlencoded({ extended: true }));

app.post('/submit', (req, res) => {
    console.log('Received request body:', req.body);

    const name = req.body.name;
    const email = req.body.email;

    const responseData = { name, email };
    res.json(responseData);
});

app.get('/', (req, res) => {
    res.send('Welcome to the root path!');
});

app.listen(port, () => {
    console.log(`Server is running on http://localhost:${port}`);
});
