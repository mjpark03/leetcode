object Solution {
    def searchInsert(nums: Array[Int], target: Int): Int = {
        search(nums, 0, nums.length-1, target)
    }
    
    def search(nums: Array[Int], start: Int, end: Int, target: Int): Int = {
        val mid: Int = (start + end) / 2
        
        mid match {
            case _ if start > end  => start
            case index if nums(index) < target => search(nums, mid+1, end, target)
            case index if nums(index) > target => search(nums, start, mid-1, target)
            case index => mid
        }
    }
}
