lockers = [1]*1000
studentNum = 1

for student in range(studentNum, len(lockers)+1):
    for idx, locker in enumerate(lockers):
        if not (idx % studentNum):
            if locker == 1:
                lockers[idx] = 0
            else:
                lockers[idx] = 1
    studentNum += 1

stillOpen = [i for i, x in enumerate(lockers) if x == 0]

print "There are " + str(len(stillOpen))+ " lockers still open."
print "Lockers that are still open: " + str(stillOpen)
