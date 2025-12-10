pos=-1
def search(list,n):
    # for i in range (len(list)):
    #     if list[i]== n:
    #         global pos
    #         pos =i
    #         return True
    #     i=i+1
    # return False
    i=0
  
    while i < len(list):
        if list[i]== n:
            global pos
            pos =i
            return True
        i=i+1
    return False


list = [5,10,15,20]
n=5
if search(list,n):
    print(f"{n} is at index {pos} in here this list")
else:
    print(f"{n}is at index not found in given list")