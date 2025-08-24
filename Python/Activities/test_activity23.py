import pytest

@pytest.mark.activity
def test_sum(num_list):
    #create a sum variable 
    sum =0
    #calculate sum of numbers in the list 
    for num in num_list : 
        sum += num

    #assertion 
    assert sum == 55

    #pytest -m activity -k "test_sum"