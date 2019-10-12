package ru.compprog.array;

/**
 * Get number by occurrence in an array
 */
public class NumOccurByWeight {

  //result array by occurence
  private int[] extended_values;

  //values[i] = weights[i] 1 222 33333 4444
  public NumOccurByWeight(int[] values, int[] weights) {
    int sum = 0;
    for (int weight : weights) {
      sum += weight;
    }

    extended_values = new int[sum];
    int cursor = 0;

    for(int i = 0; i < weights.length; i++){
      for(int j = 0; j < weights[i]; j++){
        extended_values[cursor++] = values[i];
      }
    }
  }

  public int getRandom() {
    int random = (int) (Math.random() * ( extended_values.length - 1));
    return extended_values[random];
  }
}
