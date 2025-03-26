def solution(answers):
    a1 = [1,2,3,4,5]
    a2 = [2, 1, 2, 3, 2, 4, 2, 5]
    a3 = [3, 3, 1, 1, 2, 2, 4, 4, 5, 5]

    score = [0, 0, 0]

    for i in range(len(answers)):
        if answers[i] == a1[i % len(a1)]:
            score[0] += 1
        if answers[i] == a2[i % len(a2)]:
            score[1] += 1
        if answers[i] == a3[i % len(a3)]:
            score[2] += 1

    max_score = max(score)

    result = []

    for i in range(len(score)):
        if score[i] == max_score:
            result.append(i+1)

    return result