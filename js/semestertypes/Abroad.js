var Semester = require('../Semester.js');


var Abroad = function(){
    Semester.call(this);

}

Abroad.prototype = {
    __proto__: Semester.prototype,

	func: function(){

    }

}

module.exports = Abroad;
