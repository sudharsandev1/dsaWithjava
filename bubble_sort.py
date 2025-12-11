def bubble_sort(arr):
    n=len(arr)

    for i in range(n-1):
        swap = False
        for j in range (n-1-i):
            if arr[j] > arr [ j+1 ]:
                arr[j],arr[j+1] =arr[j+1],a[j]
                swap = True
        if not swap :
            break
a=[5,10,45,90,455,34]
bubble_sort(a)
print(a)