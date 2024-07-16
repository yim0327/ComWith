function solution(phone_number) {
    number_length = phone_number.length;
    const answer = phone_number
        .slice(number_length - 4, number_length)
        .padStart(number_length, "*");

    return answer;
}
