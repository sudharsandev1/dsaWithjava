def universal_binary_search(arr, target):
    low = 0
    high = len(arr) - 1

    # detect order
    isAsc = arr[low] < arr[high]

    while low <= high:
        mid = (low + high) // 2

        if arr[mid] == target:
            return mid

        # ascending
        if isAsc:
            if target < arr[mid]:
                high = mid - 1
            else:
                low = mid + 1
        # descending
        else:
            if target > arr[mid]:
                high = mid - 1
            else:
                low = mid + 1

    return -1


print(universal_binary_search([2, 4, 8, 12, 20], 12))
print(universal_binary_search([100, 80, 60, 40, 20], 40))
