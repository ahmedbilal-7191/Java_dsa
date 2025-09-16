matrix=[[1,2,3,4],[0,6,7,0],[9,2,0,4]]
N,M=len(matrix),len(matrix[0])
row_zero=False
col_zero=False
for i in range(M):
    if matrix[0][i]==0:
        row_zero=True
for i in range(N):
    if matrix[i][0]==0:
        col_zero=True

for i in range(1,N):
    for j in range(1,M):
        if matrix[i][j]==0:
            matrix[0][j]=0
            matrix[i][0]=0
#making rows zeros most left of 2d
for i in range(1,N):
    if matrix[i][0]==0:
        col=1#can be 1
        row=i
        while col<=M-1:
            matrix[row][col]=0
            col+=1
#making cols zeros
for i in range(1,M):
    if matrix[0][i]==0:
        row=1#can be 1
        col=i
        while row<=N-1:
            matrix[row][col]=0
            row+=1
            
print(matrix)
if row_zero==True:
    for i in range(M):
        matrix[0][i]=0
        
if col_zero==True:
    for i in range(N):
        matrix[i][0]=0
        
print(matrix)


# T optimal tc improved but extraspace
# matrix=[[1,2,3,4],[0,6,7,0],[9,2,0,4]]
# N,M=len(matrix),len(matrix[0])
# row_matrix=[0]*N
# col_matrix=[0]*M
# for i in range(N):
#     for j in range(M):
#         if matrix[i][j]==0:
#             row_matrix[i]=1
#             col_matrix[j]=1
# #making rows zeros
# for i in range(len(row_matrix)):
#     if row_matrix[i]==1:
#         col=0
#         row=i
#         while col<=M-1:
#             matrix[row][col]=0
#             col+=1
# #making cols zeros
# for i in range(len(col_matrix)):
#     if col_matrix[i]==1:
#         row=0
#         col=i
#         while row<=N-1:
#             matrix[row][col]=0
#             row+=1    
# print(matrix)
# print(row_matrix,col_matrix)

#IN place no extra space but tc  bad brute force

# N,M=len(matrix),len(matrix[0])
# # Make Rows Zero
# for i in range(N):
#     for j in range(M):
#         if matrix[i][j]==0:
#             row,col=i,0
#             # Row Begining to Zero
#             while col<=M-1:
#                 if matrix[row][col]!=0:
#                     matrix[row][col]=-1
#                 col+=1
# print(matrix)
# # Make Cols Zero
# for i in range(N):
#     for j in range(M):
#         if matrix[i][j]==0:
#             row,col=0,j
#             # Row Begining to Zero
#             while row<=N-1:
#                 if matrix[row][col]!=0:
#                     matrix[row][col]=-1
#                 row+=1
#         #Make entire matrix as Zero
# for i in range(N):
#     for j in range(M):
#         if matrix[i][j]==-1:
#             matrix[i][j]=0
# print(matrix)
