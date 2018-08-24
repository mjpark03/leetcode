object Solution {
    def removeDuplicates(nums: Array[Int]): Int = {
        
        if (nums.length < 1)
            return 0
        
        var size = 0
        for (p <- 1 until nums.length) {
            if (nums(p) != nums(size)) {
                size = size + 1
                nums(size) = nums(p)
            }
        }
        
        size + 1
    }
}
