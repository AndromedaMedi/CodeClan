# computer_troubleshooting.py

# SET computer on = INPUT "Did it boot up?"
# IF answer is yes"
#   THEN PRINT "Login with password"
# ELSE IF answer is "no"
#   THEN SET plugged in INPUT "Is it plugged in?"
#   IF answer is "yes"
#       THEN PRINT "The computer is broken"
#   ELSE IF answer is "no"
#       THEN PRINT "Plug it in"
#       THEN SET fixed = INPUT "Did it fix the problem?"
#       IF answer is "yes"
#           THEN PRINT "Login with password"
#       ELSE IF answer is "no"
#           THEN PRINT "The computer is broken"
# END 




computer_on = input("Did it boot up?")

if computer_on == "yes":
    print("Log in with password")
elif computer_on == "no":
    plugged_in = input("Is plugged in?")
    if plugged_in == "yes":
        print("The computer is broken")
    elif plugged_in == "no":
        print("Plug it in")
        fixed = input("Did it fix the problem?")
        if fixed == "yes":
            print("Log in with password")
        elif fixed == "no":
            print("The computer is broken")
