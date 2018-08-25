object Solution {
    def removeElement(nums: Array[Int], `val`: Int): Int = {
        var size = 0
        
        for (i <- 0 until nums.length) {
            if (nums(i) != `val`) {
                nums(size) = nums(i)
                size += 1
            }
        }
        
        size
    }
}
