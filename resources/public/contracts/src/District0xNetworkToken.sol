pragma solidity ^0.4.24;

import "./token/minime/MiniMeToken.sol";

/**
 * @title Token used for curation of MemeFactory TCR
 *
 * @dev Standard MiniMe Token with pre-minted supply and with dead controller.
 */

contract District0xNetworkToken is MiniMeToken {
  function District0xNetworkToken(address _tokenFactory, uint _mintedAmount)
    MiniMeToken(
      _tokenFactory,
      0x0,
      0,
      "District0x Network Token",
      18,
      "DNT",
      true
    )
  {
    generateTokens(msg.sender, _mintedAmount);
    changeController(0x0);
  }
}
