size=int(input())
arr=list(map(int,input().split()))
#print(arr)
final_arr=[]
sec_arr=[]
no=False
i=0
j=len(arr)
while(len(final_arr)<j):
    if(len(arr)>0):
        val=arr.pop(0)
        if(i+1==val):
            final_arr.append(val)
            i+=1
        else:
            if(len(sec_arr)>0):
                sec_val=sec_arr.pop()
                if(i+1==sec_val):
                    final_arr.append(sec_val)
                    i+=1
                else:
                    sec_arr.append(sec_val)
                    sec_arr.append(val)
            else:
                sec_arr.append(val)
    else:
        sec_val=sec_arr.pop()
        if(sec_val==i+1):
            final_arr.append(sec_val)
            i+=1
            #print(j)
            #print('yes')
        else:
            print('no')
            no=True
            break
if(no==False):
    print('yes')
    #print('final_arr ',final_arr)
    #print('sec_arr ',sec_arr)
         
    
    
