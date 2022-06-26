const express = require('express');
const app = express();

const mysql = require('mysql2');

app.use(express.static('namek'));

let dbparams = {
    host: 'localhost',
    user: 'root',
    password: 'cdac',
    database: 'nexus',
    port: 3306
}

const conn = mysql.createConnection(dbparams);
app.get("/Accountdetails", (req, res) => {
    let input = req.query.accno;
    let datafound = { status: false, data: [] };

    conn.query("select * from bank where accno=?", [input], (err, rows) => {
        if (err) {
            console.log("error occured while fetching database");
        } else {
            if (rows.length > 0) {
                console.log("Hello");
                datafound.status = true;
                datafound.data = rows;
            }
        }
        res.send(datafound);
    });
});

app.listen(8081, function () {
    console.log("server listening at port 8081...");
});