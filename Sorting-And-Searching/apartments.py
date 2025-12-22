#https://cses.fi/problemset/result/15683470/

def main():
    lines = input().split(" ")
    n = int(lines[0])
    m = int(lines[1])
    k = int(lines[2])

    temp_req = input().split(" ")
    req = []
    for x in range(n):
        req.append(int(temp_req[x]))

    temp_apa = input().split(" ")
    apa = []
    for x in range(m):
        apa.append(int(temp_apa[x]))

    req.sort()
    apa.sort()
    counter = 0

    a = 0
    r = 0

    # keep going through apartment list
    while a < m:

        # ensure we haven't run out of people
        if r >= n:
            break

        # if we find a matching apartment, move to the next apartment and person
        if (apa[a] <= req[r] + k) and (apa[a] >= req[r] - k):
            a += 1
            r += 1
            counter += 1
        elif apa[a] > req[r] + k:
            r += 1

        # move onto the next apartment
        else:
            a += 1
    print(counter)


if __name__ == '__main__':
    main()
