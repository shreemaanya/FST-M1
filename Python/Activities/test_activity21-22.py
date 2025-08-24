import pytest

@pytest.mark.activity
def test_add():
   num1 = 20            # do it one by one and not in one line with comma separated 
   num2 = 30
   sum = num1 + num2
   assert sum == 50


def test_sub():
   num1 = 30  
   num2 = 20
   diff = num1-num2
   assert diff ==10

def test_mul():
   num1=10
   num2=20
   prod=num1*num2
   assert prod ==200

def test_div():
   num1 = 20 
   num2 = 10
   quot = num1 / num2 
   assert quot == 2

#pytest tests/test_activity21-22.py
#pytest -m activity
#pytest -v tests/test_file1.py " - gives detailed output 





