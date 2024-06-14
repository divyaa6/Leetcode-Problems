class Solution(object):
    def findMedianSortedArrays(self, nums1, nums2):
        """
        :type nums1: List[int]
        :type nums2: List[int]
        :rtype: float
        """
        num=nums1+nums2
        num.sort()
        if(len(num)%2!=0):
            return(float(num[len(num)//2]))
        else:
            
            return(((num[len(num)//2]+num[(len(num)//2)-1])/2.0)) 
        