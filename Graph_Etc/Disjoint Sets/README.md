# 서로소 집합 자료구조
- 서로소 부분 집합들로 나누어진 원소들의 데이터를 처리하기 위한 자료구조

- 서로소 집합 자료구조는 두 종류의 연산을 지원한다

   - 합집합(Union): 두 개의 원소가 포함된 집합을 하나의 집합으로 합치는 연산
   - 찾기(Find): 특정한 원소가 속한 집합이 어떤 집합인지 알려주는 연산

- 서로소 집합 자료구조는 합치기 찾기(Union Find) 자료구조라고 불리기도 한다

- 여러 개 합치기 연산이 주어졌을 때 서로소 집합 자료구조의 동작 과정은 다음과 같다

1. 합집합(Union) 연산을 확인하여, 서로 연결된 두 노드 A, B를 확인한다.
    1. A와 B의 루트 노드 A′, B′를 각각 찾는다.
    2. A′를 B′의 부모 노드로 설정한다.
2. 모든 합집합(Union) 연산을 처리할 때까지 1번의 과정을 반복한다.
## 서로소 집합을 활용한 사이클 판별
- 서로소 집합은 무방항 그래프 내에서의 사이클을 판별할 때 사용할 수 있다
   - 참고로 방향 그래프에서의 사이클 여부는 DFS를 이용하여 판별할 수 있다
- 사이클 판별 알고리즘은 다음과 같다
1. 각 간선을 하나씩 확인하며 두 노드의 루트 노드를 확인한다.

    1.루트 노드가 서로 다르다면 두 노드에 대하여 합집합(Union)  연산을 수행한다.<br>
    2. 루트 노드가 서로 같다면 사이클(Cycle)이 발생한 것이다

2. 그래프에 포함되어 있는 모든 간선에 대하여 1번 과정을 반복한다