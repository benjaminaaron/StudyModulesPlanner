var Semester = require('../Semester.js');


var Internship = function(){
    Semester.call(this);

}

Internship.prototype = {
    __proto__: Semester.prototype,

	func: function(){

    }

}

module.exports = Internship;
