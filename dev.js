var prompt = require('prompt');
var Pool = require('./js/Pool.js');

var pool = new Pool();
pool.init();
console.log(pool);


/*
prompt.start();
prompt.get('dings', function (err, result) {
     console.log('dings: ' + result.dings);
});
*/
