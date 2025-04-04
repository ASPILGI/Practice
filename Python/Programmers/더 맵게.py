import heapq

def solution(scoville, K):

    answer = 0
    heapq.heapify(scoville)

    while scoville[0] < K and len(scoville) > 1:
        first = heapq.heappop(scoville)
        second = heapq.heappop(scoville)

        new_scoville = first + (second * 2)
        heapq.heappush(scoville, new_scoville)
        answer += 1
    return answer if scoville[0] >= K else -1