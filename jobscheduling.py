def jobschedule(a):
    md = max(jo[1] for jo in a)
    tp = 0
    slot = [-1]*(md+1)
    jobs = []
    a.sort(key=lambda x:x[0],reverse = True)
    for i in range(len(a)):
        p,dl,jb = a[i]
        for d in range(md,0,-1):
            if (slot[d] == -1):
                slot[d] = 1
                tp += p
                jobs.append(jb)
                break
    return tp,jobs
pr = [100, 19, 24, 25, 15]
d = [2, 1, 2, 1, 1]
j = [f'J{i}' for i in range(1,6)]
jd = list(zip(pr,d,j))

tp,jo = jobschedule(jd)
print(tp)
print(jo)