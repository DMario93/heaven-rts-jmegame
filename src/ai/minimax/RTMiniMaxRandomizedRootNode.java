/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ai.minimax;

import ai.evaluation.EvaluationFunction;
import mrts.GameState;
import mrts.PlayerAction;
import mrts.PlayerActionGenerator;
import util.Pair;

/**
 *
 * @author santi
 */
public class RTMiniMaxRandomizedRootNode extends RTMiniMaxNode {

    public int iterations_run = 0;
    float scores[] = null;
    
    public RTMiniMaxRandomizedRootNode(GameState a_gs) {
        super(3, a_gs, -EvaluationFunction.VICTORY, EvaluationFunction.VICTORY);
    }
}
