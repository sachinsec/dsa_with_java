public class BIN_Intro {
    /*
    arr = [2,4,6,9,11,12,14,20,36,48]
    target = 36;
    (1). find the middle element
    (2). target>mid ==> search in the right else search in left.
    (3). If middle element == target element // ans
    
         {s       m              e
          2,4,6,9,11,12,14,20,36,48}

          0+9/2 = 4 indexing
          it means 11. it is less than target 36
          now 5+9/2 = 7 indexing
          it means 20. it is less than target 36 and remain two indexing 8 and 9;
          now 8+9/2 = 8 indexing
          it means 20. it is equal to  36 so answer is indexing 8

          **** taget = 12 ****

          after indexing 4 remian 5 --- 9 
          5+9/2 = 7 indexing it means 20. it greater than 12.
          now we will check before 7 indexing 
          5+6/2 = 5 indexing. it means 12 so it is equal to target.


          <<<<< Why Bineary Search ? >>>>>
          Q. find the max number of such comperision in the worst case.
          
          Total comparisons in the worst case = logn

          search in a 1,000,000
          Linear       |  Binary search
          1 millions   |  20 comparasions
            compara    |

            

    */
}
