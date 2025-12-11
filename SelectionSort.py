def selectionSort(arr):
    n = len (arr)
    for i in range (n):
        min_num = arr[i]
        min_index = i

        for j in range (i+1,n):
            if (arr[j]< min_num):
                min_num =arr[j]
                min_index = j
        temp = arr [min_index]
        arr[min_index] = arr[i]
        arr [i] = temp

a= [56,7,89,43,223,4]
selectionSort(a)
print(a)

