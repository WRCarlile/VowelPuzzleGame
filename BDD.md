##Behavior for junit tests##																		##Input##                                      ##Output##
User inputs a sentence and 							"The sun will come out tomorrow"									"Th- s-n w-ll c-m- --t t-m-rr-w"
a puzzle is generated where
all vowels are removed from
every word and replaced with
the dash symbol "-".

Second User recieves the "coded"				"The sun will come out tomorrow"													"You win!"
sentence and tries to input the
correct answer.

Second User recieves the "coded"					The son will come out tomorrow"													"Try Again"
sentence and enters a false answer.




##Behavior for fluentlenium tests##															##Input##                                      ##Output##
User navigates to home and sees text.														Page Loads																	Texts reads "Vowel Game"

User inputs data into the form																		"Hello"																			puzzle reads:	"H-ll-"
and page is navigated to the
puzzle page.

On puzzle page user inputs their 																	"Hello"																	winner screen reads:"You Win!"
guess to answer the puzzle
puzzle page navigates to winner
screen.
