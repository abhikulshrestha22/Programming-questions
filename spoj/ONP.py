test_cases=int(input())
for i in range(test_cases):
    exp=list(input())
    j=0
    short_str=''
    while(j<len(exp)):
        if(exp[j]==')'):
            exp.pop(j)
            j-=1
            while(exp[j]!='('):
                if(exp[j].isalnum()):
                    short_str=exp.pop(j)+short_str
                else:
                    short_str+=exp.pop(j)
                exp.pop(j)
                
                j-=1
            print(short_str)
        j+=1
        
            

        
        
