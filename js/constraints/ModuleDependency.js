var Constraint = require('../Constraint.js');


var ModuleDependency = function(){
    Constraint.call(this);

}

ModuleDependency.prototype = {
    __proto__: Constraint.prototype,

	func: function(){

    }

}

module.exports = ModuleDependency;
