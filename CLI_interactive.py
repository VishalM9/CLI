import wikipedia as wiki
import sys


search_term=str(input("Enter search term : "))
log_file=str(input("Enter the file you want to out the data : "))

search=wiki.search(search_term, results = 1, suggestion = True)

search_page=wiki.page(search[0][0])
print(search_page.url)

f=open(log_file,"a+")

f.write(str(search_page.url)+"\n")

f.close()