# Systems Modeling 2020

## Lecture 11 (17.11.2020)

### Discussion

1) What about the model code gap? Will it be easier to hand-code business processes than modeling them and why or why not (try to give examples)? [quick survey]
- Modelling/diagrams (if done well) can be more easily used to verify/analyze the business process and communicate with other, non-technical people, than code itself. An analyst or manager will probably not write code (or maybe not even know how to code). 

2) Pick one of the most important application domains for BPM.
- Logistics. Marlon said big companies, that's also very true, regardless of domain - there is value in understanding any complex process.

3) In which cases in this class, would BPM been feasible?
- When dealing with a bank. Other examples have been small or simple (e.g. games). But since we are still only handling the software side (and even there only transactions and account creation), not all the other (real) parts of the bank (e.g. newsletters, bank cards, savings accounts, loans, investments, pension, insurance etc), it's still not as useful. The amount of actual business processes is low, so it actually can be used, but there's not many thigns to model.

4) How would you think BPM relates to flow-charts, activity diagrams, and statecharts?
- It's domain specific, but very similar in terms of what it is intended to achieve - a modelling of the process: actvities/events, branch points and conditions, start and end points etc. It also allows swimlanes to separate agents/objects, similar to activity diagrams. It's intended to support many things; while we had a separate diagram for separate aspects in UML, BPM has a lot of available notation and very many details can be put in a single diagram.

#### Visitor discussion

It's hard to understand the visitor pattern since the example given seemed artificial, clunky. How is a visitor different from just a simple interface? Why name it something else than an 'interface' which is the standard term to use?

I cannot see a use of the visitor pattern within the bank project, unless it's nothing else than a regular interface.


### Lecture reflections
I saw some discussion on the Wiki page of design patterns that many Gang of Four design patterns are very straightforward to implement in newer programming languages. The line between what is a design pattern and what is merely a language feature, is blurry. 
I have to read more about it, I think there is an interesting point to be made here.

### Lab reflections

Time spent on the project, with work type and reflections:

- 17.11.2020, 2h 30m. Planned upcoming work, decided to start reading ASP.NET Core documentation, Googling occasionally if needed and found some other tutorials to use later as well. Attempted to create basic initial models, which I commited the next day.
- 19.11.2020, 2h. Continued reading about ASP.NET, need to figure out how the bloody thing works. Am I crazy for taking the architecture owner role knowing almost nothing of ASP.NET or web development? TBD
- 20.11.2020, 6h 30m. Continued reading, thought about models. Wrote down questions for myself, made some decisions about models. Later found out that ASP.NET takes care of many things for us since it already has classes for Users and Roles. Implemented Lauri's suggestions on the class models - thanks, Lauri!
- 24.11.2020, 4h 20m. Reflected on the model and looked at Issue list and our discussion to see what fields could be needed and if they already exist in the model or not. By the end of the day I had finally finished the most important parts of the ASP.NET documentation and one long-ish, but useful tutorial. Code is no longer in Chinese, but many design decisions are still unclear - what will ASP.NET do for us and what we have to do ourselves?
