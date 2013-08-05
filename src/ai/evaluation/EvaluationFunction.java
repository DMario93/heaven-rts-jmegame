/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ai.evaluation;

import mrts.GameState;

/**
 *
 * @author santi
 */
public abstract class EvaluationFunction {    
    public static float VICTORY = 10000;
    
    public abstract float evaluate(int maxplayer, int minplayer, GameState gs);
}
