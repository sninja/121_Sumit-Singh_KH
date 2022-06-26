
const { response } = require('express');
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

app.get('/getAllResources', function (req, resp) {
    conn.query('select * from resource', [], (err, rows) => {
        if (err) {
            result = err;
            console.log("trouble " + result);
        } else {
            for (let i = 0; i < rows.length; i++)
                console.log(rows[i].resource_id + " " + rows[i].resourcename + " " + rows[i].statuss);
        }
        resp.send(rows);
    });
});

app.get('/insertresource', function (req, resp) {
    console.log("inside add route");
    let rdetails = { rid: req.query.rid, rname: req.query.rname, status: req.query.status }
    let output = { status: false }

    conn.query('insert into resource (resource_id, resourcename, statuss) values (?, ?, ?)',
        [rdetails.rid, rdetails.rname, rdetails.status],
        (error, resu) => {
            if (error) {
                console.log(error);
            }
            else {
                if (resu.affectedRows > 0) {
                    console.log("Inserted successfully");
                    output.status = true;
                }
                else {
                    console.log("Insertion failed");
                }
            }
            resp.send(output);
        });
});

app.get("/updateresource", (req, resp) => {
    console.log("Inside update route");

    let rdetails = { rid: req.query.rid, rname: req.query.rname, status: req.query.status }
    let output = { status: false }

    conn.query('update resource set resourcename = ?, statuss = ? where resource_id = ?',
        [rdetails.rname, rdetails.status, rdetails.rid],
        (error, res) => {
            if (error) {
                console.log(error);
            }
            else {
                if (res.affectedRows > 0) {
                    console.log("Update Successful");
                    output.status = true;
                }
                else {
                    console.log("Update failed");
                }
            }
            resp.send(output);
        });
});

app.get("/deleteresource", (req, resp) => {
    console.log("Inside delete router");

    let rdetails = { rid: req.query.rid }
    let output = { status: false }

    conn.query('delete from resource where resource_id = ?',
        [rdetails.rid],
        (error, res) => {
            if (error) {
                console.log(error);
            }
            else {
                if (res.affectedRows > 0) {
                    console.log("Delete Successful");
                    output.status = true;
                }
                else {
                    console.log("Delete failed");
                }
            }
            resp.send(output);
        });
});


app.listen(8081, function () {
    console.log("server listening at port 8081...");
});