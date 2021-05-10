if __name__ == '__main__':
    n = int(input())
    integer_list = map(int, input().split())
    tu = list(map(int, integer_list))
    t = tuple(tu)
    print(hash(t))
