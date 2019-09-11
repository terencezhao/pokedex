proWebservice:

To start the webservice, execute the main method inside ProWebserviceApplication.
Once the application is started, visit your localhost:8080 endpoint.
You will be greeted with a cover page giving a brief description of the project.
In the upper left corner you will see a navigation menu for the Pokedex and Api pages.
The Pokedex will take you to the main application while the Api page shows JSON.

Upon visiting the /pokedex endpoint, you will see a list of Pokemon that 
have been pre added. On the right side of each pokemon entry, you will see
a green drop down button with several options (View, Edit, Delete, JSON) 
The "View" button will take you to an alternate view showing the specific
pokemon you are interested in. 
The "Edit" button will allow you to modify the information for the selected pokemon. 
Once you have finished your changes, you can click the Submit button.
You will be brought back to the pokedex page where you can observe your edit.
The "Delete" button will remove the pokemon from the list.
Finally, the Api (JSON) button will serve up the JSON data corresponding
to the pokemon. The /api page itself will give a JSON consisting of all
the pokemon currently in the pokedex.

In the top right corner you will also see a red button for Adding a Pokemon.
Clicking this will bring you to a form page where you can fill out the details
of the Pokemon you want to add.
You will notice that the Element row has a pre-populated drop-down menu
consisting of the Many-To-One relationship that pokemon have with type.
Once you have finished filling out the form, you can click submit.
You will see that the pokedex page has been updated with your addition.

------------------------------------------------------------------------
*NOTE*
------------------------------------------------------------------------
For your convenience, try adding a Pikachu to the Pokedex with the following information:
Number: 25
Name: Pikachu
Element: Electric
Height: 0.4
Weight: 6.0
Level: 12
HitPoints: 40
Description: When several of these Pokemon gather, their electricity can cause lightning storms.
ImgUrl: http://cdn.bulbagarden.net/upload/thumb/0/0d/025Pikachu.png/250px-025Pikachu.png
------------------------------------------------------------------------

Thanks and Enjoy!
-Terence

