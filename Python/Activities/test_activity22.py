import pytest

num1 = 56
num2 = 78

#Sum of two numbers
def test_sum():   
    sum = num1 + num2
    assert sum == 134


#Difference of two numbers
def test_diff():
    diff = num2 - num1
    assert diff == 22

#Product of two numbers
@pytest.mark.activity
def test_prod():
    prod = num1*num2
    assert prod == 4368

#Quotient of two numbers
@pytest.mark.activity
def test_quot():
    quots = num2/num1
    assert quots == 1.3928