import React, { useEffect, useState } from "react";
import {
  TableContainer,
  Table,
  TableHead,
  TableBody,
  TableRow,
  TableCell,
  Paper,
} from "@mui/material";
import axios from "axios";
import BitcoinIcon from "../assets/BitcoinIcon.svg";
import EthereumIcon from "../assets/EthereumIcon.svg";
import Ethereum2Icon from "../assets/Ethereum2Icon.svg";
import TetherIcon from "../assets/TetherIcon.svg";

export const Assets = () => {
  const [tableData, setTableData] = useState([
    {
      id: "",
      iconURL: "",
      cryptoName: "",
      type: "",
      price: "",
      change: "",
      marketCap: "",
    },
  ]);
  useEffect(() => {
    axios
      .get(
        "https://570ac1be-ba57-48a7-86c9-6733d71bc81a.mock.pstmn.io/cryptoCurrency"
      )
      .then((res) => {
        const result: [
          {
            id: string;
            iconURL: string;
            cryptoName: string;
            type: string;
            price: string;
            change: string;
            marketCap: string;
          }
        ] = res.data;
        console.log(result);
        setTableData(result);
      });
  }, []);

  const getImage = (iconURL: string) => {
    switch (iconURL) {
      case "BitcoinIcon":
        return BitcoinIcon;
      case "EthereumIcon":
        return EthereumIcon;
      case "Ethereum2Icon":
        return Ethereum2Icon;
      case "TetherIcon":
        return TetherIcon;
      default:
        return "";
    }
  };

  return (
    <TableContainer component={Paper}>
      <Table>
        <TableHead>
          <TableRow>
            <TableCell>Icon</TableCell>
            <TableCell>Name</TableCell>
            <TableCell>Price</TableCell>
            <TableCell>Change</TableCell>
            <TableCell>Market Cap</TableCell>
          </TableRow>
        </TableHead>
        <TableBody>
          {tableData.map((row) => (
            <TableRow key={row.id}>
              <TableCell>
                <img src={getImage(row.iconURL)} alt="Icon"></img>
              </TableCell>
              <TableCell>{row.cryptoName}</TableCell>
              <TableCell>{row.price}</TableCell>
              <TableCell>{row.change}</TableCell>
              <TableCell>{row.marketCap}</TableCell>
            </TableRow>
          ))}
        </TableBody>
      </Table>
    </TableContainer>
  );
};
