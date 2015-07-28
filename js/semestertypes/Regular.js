var Semester = require('../Semester.js');


var Regular = function(){
    Semester.call(this);

}

Regular.prototype = {
    __proto__: Semester.prototype,

	func: function(){

    }

}

module.exports = Regular;
