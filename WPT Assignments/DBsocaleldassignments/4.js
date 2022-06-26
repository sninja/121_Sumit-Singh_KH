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

app.get('/getareaname', (req, resp) => {

    let output = { status: false, detail: { pin: 0, areaname: "" } }
    let pin = req.query.pin;
    console.log(pin);
    conn.query('select pin, areaname from location where pin = ?', [pin],
        (error, rows) => {
            if (error) {
                console.log(error);
            }
            else {
                if (rows.length > 0) {
                    output.status = true;
                    output.detail = rows[0];
                }
                else {
                    console.log("Area with this pin code does not exist");
                }
            }
            console.log(output);
            resp.send(output);
        });

});

app.get('/updateareaname', (req, resp) => {

    let output = { status: false }
    let pin = req.query.pin;
    let areaname = req.query.areaname;
    console.log(pin);
    conn.query('update location set areaname = ? where pin = ?', [areaname, pin],
        (error, res) => {
            if (error) {
                console.log(error);
            }
            else {
                if (res.affectedRows > 0) {
                    output.status = true;
                }
                else {
                    console.log("Updated failed");
                }
            }
            console.log(output);
            resp.send(output);
        });
});

app.listen(8081, function () {
    console.log("server listening at port 8081...");
});