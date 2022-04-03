The purpose of this project is to create a functional DMS (Dealer management system) inspired by the DMS my place of employment uses as my first go at learning git, github, and Java. 

Predictably I'm starting by building the classes and functionality behind all of them, after that I'll implement some application logic to launch and run the program with user input, and eventually (not sure how long term this part is) will implement a GUI as I've never done that. 

This is totally a learn as I go process, I'm 3/4 through MOOC Java 2 after trying for years to get throgh it. I've decided I think I know enough to just start doing. I'm going to try to finish up MOOC, but right now it just can't keep my attention, and something is better than nothing. 

I intend to work on this completely solo until I have the first 2 of 3 steps complete, the back information and the application logic. After that I'll make the repo public to crowdsource some critiques, likely from reddit, and after making those changes move on to learning to build a GUI.

Good luck to me.


#TODO

add comments to existing code 

add the salesman class 

refactor the department class 

develop user interface 

add toString methods to various classes

implement the UserInterface class - I imagine this will involve refactoring other classes to remove the user input functionality and some print statements. the removeJob method in RepairOrder comes to mind

refactor RepairOrder class - currently one technician can be assigned to a repair order, eventually this needs to be reworked so that the repairorder is independent of the technician, that way multiple techs can be on a repair order but on different jobs

create a list of jobs, maybe using op codes as a guideline for a class. The idea is to have a list of jobs to choose from, opposed to creating a new job object with arbritrary description and hours. 

COMPLETED: Add a way to create new job objects in the RepairOrder class, currently they can only be added, but there is no way to instantiate the job object

refactor Jobs to extend OpCodes as it's superclass
