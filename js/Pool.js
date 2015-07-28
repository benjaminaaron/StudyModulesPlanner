var Module = require('./Module.js');
var Constraint = require('./Constraint.js');
var Studypath = require('./Studypath.js');


var Pool = function(){
	this.modules = [];
	this.constraints = [];
	this.studypaths = [];
}

Pool.prototype = {

	init: function(){

		var testmodule = new Module('Testmodule', 5);

		var teststudypath = new Studypath('Teststudypath', null);
		teststudypath.mandatoryModules.push(testmodule);

		this.modules.push(testmodule);
		this.studypaths.push(teststudypath);

    }

}

module.exports = Pool;
