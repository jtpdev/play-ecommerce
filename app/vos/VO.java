package vos;

public interface VO<M> {

	/**
	 * To get the model By VO
	 * 
	 * @return model
	 */
	M toModel();

	/**
	 * To construct a VO by model
	 * 
	 * @param model
	 */
	VO<M> toVO(M model);

}
