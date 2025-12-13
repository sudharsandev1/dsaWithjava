def merge_two_sort_array (arr,brr):

    n = len(arr)
    m = len(brr)
    result = [0]*(n+m)
    i=0
    j=0
    k =0
    
    while i < n and j< m:

        if arr[i]< brr[j]:
            result [k]=arr[i]
            i += 1
           
        else:
            result [k]= brr[j]
            j +=1
    k=k+1      
 
    
    while i < n:
        result [k]=arr[i]
        i+=1
        k+=1
    while j < m:
        result [k] =brr[j]
        j+=1
        k+=1
    return result

a = [2,3,4,1]
b = [4,5,6,2]
result = merge_two_sort_array(a,b)
print(result)

