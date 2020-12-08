# Systems Modeling 2020

## Lecture 12 (24.11.2020)

### Discussion

**Observer pattern:**
1. problems/annoyances:
- can't see any right now. This pattern has good use cases and I've used it before. 
2. 1 example in our bank usecase
- if the webpage is not static, then in case a user is logged in and receives a transaction, this can be shown to them immediately as a popup.
3. 1 example outside bank usecase
- chatrooms (a message is received -> sent to all clients connected to the chat). Any responsive/reactive UI that has its elements changed and need redrawing, really, or if UI elements are changed by the user (text inserted into textbox) and internal model needs updating (e.g. validation checks for input data)

**Command pattern:**
1. problems/annoyances:
- Can't think of something else than what was mentioned by another student: overhead in programming/implementing it.
2. 1 example in our bank usecase:
- from Mike Carmara came a good suggestion: in case some part of the platform is down, then commands can be saved and executed when things are back up.
3. 1 example outside bank usecase:
- reading in and parsing program arguments to do some complex operation on data that the user has provided themselves (e.g. '--output logfile.log' to channel output log to a specified file).


**What is Ncameo?**
- a startup that helps businesses with creating IT applications faster and with a fraction of the cost.

**What are their services?**
- main service: a platform that helps with creating custom-built, no-code applications with cloud support.

**Expectations regarding System's Modelling? (What models/methods do you expect them to use?)**
- I would assume that they have helpful diagrams shown to the users, who are non-technical people (as intended), but could still benefit from understanding how their platform works.
	- if users are not that interested, then this might not be relevant. But use cases and user stories and personas are extremely relevant - that's the entire core approach. 
	- Maybe internally they are using auto-generated diagrams to verify that things are working as they should? That wiring between modules exists etc..

**What was most impressive, particular, insightful in Ncameo's history and current
way of work?**
- Showing the customer the result from day one can be really helpful - this can reduce the amount of work that needs to be redone.
- Why was this not possible 20 years ago? Clients are asking for it, better customer experience. There is power of the cloud. Data-driven decision making is possible now. 
- Being business-focused looks useful. A developer does not think in terms of backend or frontend that much, but in terms of bringing value to the business and their goals must be in view from the start. 

**One question regarding architectural or modeling elements in their practice.**
- Do you do any auto-generated diagrams from code / UI elements to show the flow of data etc.

**How could Ncameo's No-Code environment been helpful building your class
project?**
- We wouldn't need UI mockups/wireframes if we can immediately start with the no-code environment.

### Lecture reflections
I like this process of finding a name, a category, for something that I have seen already before. Or when the same concept can be thought in a wider way. E.g. the command pattern is very basic if I think about command line programs. This pattern was already familiar to me, but once I start reading about it, I see that this can be used in so many places. 

### Lab reflections

Time spent and reflections on done work:

- 27.11, 4h. Prepared some questions for Einar, which he thoroughly answered, eliminating some confusions that I had. 
- 29.11, 5h 30m. Worked on creating readable and informative class diagrams and DB schema. Later saw that we had new committs and need to revisit models to look out for model-code gap. 
- 30.11, 1h. Went over code, read about ASP.NET DB side.
- 01.12: 2h. Went over code, looking for model-code gap and planned what to do next, especially regarding the architecture report.
