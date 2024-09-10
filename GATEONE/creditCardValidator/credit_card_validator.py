

card_num = str(input("Hello, Kindly Enter Card details to verify: "))
number = [int(digit)for digit in card_num] 
if(len(number) < 13 or len(number) > 16):
	print('Card Invalid')
total = 0
sum_odd = 0

for digit in range (len(number)-2,-1,-2):
	second_index = number[digit] * 2 
	if(second_index > 9):
		second_index = second_index % 10 + second_index // 10
	total = total + second_index

for digit in range (len(number)-1,0,-2):
	sum_odd = sum_odd + number[digit] 

sum_total = sum_odd + total

print('********************************************')
if(number[0] == 4 & (len(number) < 13 or len(number) > 16) ):
	print('**Credit Card Type : VisaCard')
elif(number[0] == 5 & (len(number) < 13 or len(number) > 16)):
	print('**Credit Card Type : MasterCard')
elif(number[0] == 6 & (len(number) < 13 or len(number) > 16)):
	print('**Credit Card Type : Discover Card')
elif(number[0] == 3 and number[1] == 7  & (len(number) < 13 or len(number) > 16)):
	print('**Credit Card Type :  American Express Card')
else:
	print('Invalid Card Type')
print('**Credit Card Number :' + card_num)
print('**Credit Card Digit Length :',len(number))

if(sum_total % 10 == 0):
	print('**Credit Card Validity Status :'+'valid')
else:
	print('**Credit Card Validity Status :'+'invalid')



print('********************************************')













