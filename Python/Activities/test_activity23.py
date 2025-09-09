import pytest

def test_sum(num_list):
    #create a sum variable
    sum =0
    #calculate sum of numbers
    for num in num_list:
        sum += num

        assert sum == 55
