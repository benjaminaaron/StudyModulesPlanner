# StudyModulesPlanner
A tool to filter through university courses and strategically plan which ones to take.
Filter all courses by your study program and by the ones that are currently offered.
The advanced feature is to put in your current state (which semester you are in, which exams you already passed) and then get a recommended set/path of courses to take which will fulfill your ECTS-account (and maybe your set preferences and recommendations from alumnis).
Also dependencies (like you need to pass course A to be allowed to take course B) and deadlines (like two more consecutive trials of this exam or you need x ECTS before the y-th semester starts) should get into the tool.

It will consist of two logical main elements. The **pool** that contains all modules, rules and default *playlists*. It can be modified directly by authorized users or crowdsourced by anonymous users. The **planner** then arranges the modules according to the respective playlist and rules.

I will develop this first for the faculty of my university (cs.hm.edu), based on the data under fi.cs.hm.edu. But eventually the idea is to make it easily adoptable for other universities.

## Usage

`npm install`

`node app.js`
