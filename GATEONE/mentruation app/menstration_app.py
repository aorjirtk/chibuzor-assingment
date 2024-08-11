from datetime import datetime,timedelta
print("*************************************************************************************")
user_name = input("Please tell us your name: ")
print()
print("dear ",(user_name), "welcome to Jagbajantis Mestruation Calculator\n please help provide the following informations: ")
print()
print("please note that we maintain strict privacy policy, all your details are safe")
print()
next_flow = input("Enter the last date you saw your period in this format 'yyyy-mm-dd: ")
print()
ovulation_date = input("Enter the date you saw your ovulation last: ")

period_length = 28
ovulation = 14
my_date_format = "%Y-%m-%d"
start_date = datetime.strptime(next_flow,my_date_format)

date1 = timedelta(period_length)
next_period = start_date + date1
print("Your next flow will be on: ",next_period)
 
print()

safe_period = 7

date2 = timedelta(safe_period)

safe_period = next_period - date2

print("Your safe period is: ", safe_period,next_period)

print()

date3 = datetime(period_length)
flow_period = next_period + date3
print("Your next flow will end on: ", flow_period)

print()



date4 = datetime(ovulation_date)

date5 = datetime(ovulation)
ovulation_dates = date4 + date5
ovulation_period = next_period - ovulation_dates

print("Its is highly possible your ovulation falls within: ", ovulation_period)















