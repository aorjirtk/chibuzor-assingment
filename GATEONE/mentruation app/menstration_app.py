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
period_length_end = int(input("How long dOes your period last: "))


period_length = 28

my_date_format = "%Y-%m-%d"
start_date = datetime.strptime(next_flow,my_date_format)

date1 = timedelta(period_length)
next_period = start_date + date1

print()

print()

date3 = timedelta(period_length_end)
flow_period = next_period + date3

print("YOUR FLOW WILL LIKELY BE FROM: ",next_period,"-",flow_period)

print()

last_day_of_ovulation = 5
start_ovulation = 5
start_ovulation1 = timedelta(start_ovulation)
date5 = timedelta(last_day_of_ovulation)
real_start_ovulation = start_ovulation1 + flow_period
end_ovulution = real_start_ovulation + date5


print("IT IS HIGHLY POSSIBLE YOUR OVULATION FALL WITHIN: ", real_start_ovulation, "-",end_ovulution)

 
print()

safe_period_zone = 13
safe_period_length = 10

date2 = timedelta(safe_period_length)
date7 = timedelta(safe_period_zone)
safe_period = flow_period + date2

safe_time_zone = end_ovulution + date7

print("YOUR SAFE PERIOD WILL BE WITH: ", end_ovulution,'-',safe_time_zone)


print("THANK YOU FOR TRUSTING US")

print("*************************************************************************************")














