# Systems Modeling 2020

## Lecture 13 (01.12.2020)

### Discussion

**Problems with Singleton?**
	- if you want to do lazy initialization to speed up program start time and you have a multithreaded program, you need to make sure that object creation is thread safe.
	- poorly used singletons make testing difficult.

Where to use?
- wherever a single object is required, e.g. with database layer: we might want a connection pool, and doing this entails some singleton which can be accessed everywhere.

----

- How did you like working with Fulib in beginning of this class (1 not at all – 5 very much).
	- 2

- Explain your choice (why/what did you like, what did you dislike and why).
	- It seems to still have not that many features and requires time to learn it to use well. So it might not be worth it that much for me. 

- Which feature looks exciting for you to revisit using Fulib in a software modeling environment?
	- HTML generation - allows faster prototyping

- Write down one example where the use of Fulib would have simplified your work with your current final project.
	- Prototyping the UI, probably?

- What are your two main reasons why you are not using Fulib anymore or would not use it again?
	- I am not working on front-end development, I have other frameworks that I am familiar with that already make development easier - learning another might not be worth it.
	- If I'd go over the documentation to fully see the use cases and see where I could use it and need to use it, I might consider it. But right now I didn't see where/how I could really use it. There is a cost to learning it as well. I also haven't really worked on software that is big enough to really require additional tools like Fulib.

- Write down at least one point that you would like to see change to make Fulib more attractive for (students in) systems modeling?
	- Autocomplete, maybe?

- Would you have liked to do more work with Fulib to explore based on what you have seen right now?
	- I think an introduction and link to docs/features is good enough: anybody can follow up. 

### Lecture reflections
It was mentioned in lecture and I think also in Discord that Singletons are often a bad idea. But there are cases (e.g. database layer connection pool) where it makes sense, so I would still defend their usage. But maybe there are better ways of handling these types of scenarios that I am not aware of.

### Lab reflections

Time spent on project and reflections on work done:

- 02.12: 0.5h. Planning report, researching ASP.NET architecture.
- 03.12: 0.5h. Implemented state diagrams. Overview of our classes/architecture. Still need to find a ASP.NET architecture overview (can be also used in video) to show what each part basically does (the ones that we actually use: authentication, razor pages, model binding and validation). 
- 04.12: 1h 15m. Worked on diagrams. Totally forgot our small meeting at noon, forgot to mark it in calendar and Discord did not show notifications. Need to use calendar more.  Also worked on report final version skeleton. Transaction sequence diagram draft (still no implementation!?, so am speculating).
- 05.12: 1h 30 minutes. Reading about design patterns, looking for them in code. Writing some parts of the final report. 
- 06.12: 1h 15 min. Worked on report. 
- 07.12: 2h 45 min. Worked on report.
