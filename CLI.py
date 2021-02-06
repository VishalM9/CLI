import wikipedia as wiki
import sys

#input(search_term=sys.argv[1])
search_term=str(sys.argv[1])
log_file=str(sys.argv[2])

search=wiki.search(search_term, results = 1, suggestion = True)

search_page=wiki.page(search[0][0])
print(search_page.url)

f=open(log_file,"a+")

f.write(str(search_page.url)+"\n")

f.close()